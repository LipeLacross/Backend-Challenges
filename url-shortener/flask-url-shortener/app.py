from flask import Flask, request, jsonify, redirect, abort
import random
import string
import time

app = Flask(__name__)

urls = {}  # Simulação de banco de dados em memória

def generate_short_code(length=6):
    characters = string.ascii_uppercase + string.digits
    return ''.join(random.choice(characters) for _ in range(length))

@app.post('/shorten-url')
def shorten_url():
    data = request.json
    url = data.get('url')
    short_code = generate_short_code()
    urls[short_code] = {
        'original_url': url,
        'expiry': time.time() + 24 * 60 * 60  # 24 horas de validade
    }
    short_url = f'https://xxx.com/{short_code}'
    return jsonify({'url': short_url})

@app.get('/<short_code>')
def redirect_url(short_code):
    url_data = urls.get(short_code)
    if url_data and url_data['expiry'] > time.time():
        return redirect(url_data['original_url'])
    else:
        abort(404)

if __name__ == '__main__':
    app.run(port=3000)
