from flask import Flask, request, jsonify

app = Flask(__name__)

def validate_password(password):
    errors = []
    if len(password) < 8:
        errors.append('A senha deve ter pelo menos 8 caracteres.')
    if not any(char.isupper() for char in password):
        errors.append('A senha deve conter pelo menos uma letra maiúscula.')
    if not any(char.islower() for char in password):
        errors.append('A senha deve conter pelo menos uma letra minúscula.')
    if not any(char.isdigit() for char in password):
        errors.append('A senha deve conter pelo menos um dígito numérico.')
    if not any(char in '!@#$%^&*(),.?":{}|<>' for char in password):
        errors.append('A senha deve conter pelo menos um caractere especial.')

    return errors

@app.post('/validate-password')
def validate_password_endpoint():
    data = request.json
    password = data.get('password')
    errors = validate_password(password)

    if errors:
        return jsonify({'errors': errors}), 400
    else:
        return '', 204

if __name__ == '__main__':
    app.run(port=3000)
