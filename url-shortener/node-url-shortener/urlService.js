const crypto = require('crypto');

const urls = {}; // Simulação de banco de dados em memória

const shortenUrl = (url) => {
    const shortCode = crypto.randomBytes(5).toString('hex').toUpperCase(); // Gerar código encurtado
    urls[shortCode] = {
        originalUrl: url,
        expiry: Date.now() + 24 * 60 * 60 * 1000 // 24 horas de validade
    };
    return { shortUrl: `https://xxx.com/${shortCode}` };
};

const redirectUrl = (shortCode) => {
    const urlData = urls[shortCode];
    if (urlData && urlData.expiry > Date.now()) {
        return urlData.originalUrl;
    }
    return null;
};

module.exports = { shortenUrl, redirectUrl };
