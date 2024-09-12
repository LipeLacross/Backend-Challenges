const express = require('express');
const app = express();
const port = 3000;

app.use(express.json());

app.post('/customer-loans', (req, res) => {
    const { age, income, location, name } = req.body;
    const loans = [];

    if (income <= 3000 || (income > 3000 && income <= 5000 && age < 30 && location === 'SP')) {
        loans.push({ type: 'PERSONAL', interest_rate: 4 });
    }

    if (income >= 5000) {
        loans.push({ type: 'CONSIGNMENT', interest_rate: 2 });
    }

    if (income <= 3000 || (income > 3000 && income <= 5000 && age < 30 && location === 'SP')) {
        loans.push({ type: 'GUARANTEED', interest_rate: 3 });
    }

    res.status(200).json({
        customer: name,
        loans
    });
});

app.listen(port, () => {
    console.log(`Servidor rodando na porta ${port}`);
});
