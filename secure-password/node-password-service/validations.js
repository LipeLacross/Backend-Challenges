const validatePassword = (password) => {
    const errors = [];
    const minLength = 8;
    const hasUppercase = /[A-Z]/.test(password);
    const hasLowercase = /[a-z]/.test(password);
    const hasDigit = /\d/.test(password);
    const hasSpecialChar = /[!@#$%^&*(),.?":{}|<>]/.test(password);

    if (password.length < minLength) errors.push('A senha deve ter pelo menos 8 caracteres.');
    if (!hasUppercase) errors.push('A senha deve conter pelo menos uma letra maiúscula.');
    if (!hasLowercase) errors.push('A senha deve conter pelo menos uma letra minúscula.');
    if (!hasDigit) errors.push('A senha deve conter pelo menos um dígito numérico.');
    if (!hasSpecialChar) errors.push('A senha deve conter pelo menos um caractere especial.');

    return {
        valid: errors.length === 0,
        errors
    };
};

module.exports = { validatePassword };
