from flask import Flask, request, jsonify

app = Flask(__name__)

@app.post('/customer-loans')
def customer_loans():
    data = request.json
    age = data.get('age')
    income = data.get('income')
    location = data.get('location')
    name = data.get('name')

    loans = []

    if income <= 3000 or (3000 < income <= 5000 and age < 30 and location == 'SP'):
        loans.append({"type": "PERSONAL", "interest_rate": 4})

    if income >= 5000:
        loans.append({"type": "CONSIGNMENT", "interest_rate": 2})

    if income <= 3000 or (3000 < income <= 5000 and age < 30 and location == 'SP'):
        loans.append({"type": "GUARANTEED", "interest_rate": 3})

    return jsonify({"customer": name, "loans": loans})

if __name__ == '__main__':
    app.run(port=3000)
