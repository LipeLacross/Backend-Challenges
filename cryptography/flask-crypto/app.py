from flask import Flask, request, jsonify
from cryptography.fernet import Fernet

app = Flask(__name__)

# Gerar chave e criar objeto de criptografia
key = Fernet.generate_key()
cipher = Fernet(key)

data_store = []  # Simulação de banco de dados

@app.route('/items', methods=['POST'])
def create_item():
    data = request.json
    user_document = cipher.encrypt(data['userDocument'].encode()).decode()
    credit_card_token = cipher.encrypt(data['creditCardToken'].encode()).decode()
    new_item = {'id': len(data_store) + 1, 'userDocument': user_document, 'creditCardToken': credit_card_token, 'value': data['value']}
    data_store.append(new_item)
    return jsonify(new_item), 201

@app.route('/items/<int:item_id>', methods=['GET'])
def get_item(item_id):
    item = next((d for d in data_store if d['id'] == item_id), None)
    if item:
        item['userDocument'] = cipher.decrypt(item['userDocument'].encode()).decode()
        item['creditCardToken'] = cipher.decrypt(item['creditCardToken'].encode()).decode()
        return jsonify(item)
    else:
        return jsonify({'error': 'Item não encontrado'}), 404

if __name__ == '__main__':
    app.run(port=3000)
