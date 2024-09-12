from flask import Flask, request, jsonify

app = Flask(__name__)

# Token de exemplo para validação
VALID_TOKEN = 'vYQIYxOpyfr=='

@app.before_request
def validate_token():
    token = request.headers.get('Authorization')
    if token != VALID_TOKEN:
        return jsonify({'error': 'Token inválido'}), 401

@app.route('/foo-bar', methods=['GET'])
def foo_bar():
    return '', 204

if __name__ == '__main__':
    app.run(port=3000)
