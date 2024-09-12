from flask import Flask, request, jsonify
import math
import json

app = Flask(__name__)

# Dummy database
def get_pois():
    try:
        with open('db.json', 'r') as f:
            return json.load(f)
    except FileNotFoundError:
        return []

def save_pois(pois):
    with open('db.json', 'w') as f:
        json.dump(pois, f, indent=2)

@app.post('/pois')
def create_poi():
    data = request.json
    pois = get_pois()
    pois.append(data)
    save_pois(pois)
    return jsonify({'message': 'POI created'}), 201

@app.get('/pois')
def list_pois():
    pois = get_pois()
    return jsonify(pois), 200

@app.get('/pois/nearby')
def list_nearby_pois():
    x = float(request.args.get('x'))
    y = float(request.args.get('y'))
    distance = float(request.args.get('distance'))
    pois = get_pois()
    nearby_pois = [poi for poi in pois if math.sqrt((poi['x'] - x) ** 2 + (poi['y'] - y) ** 2) <= distance]
    return jsonify(nearby_pois), 200

if __name__ == '__main__':
    app.run(port=3000)
