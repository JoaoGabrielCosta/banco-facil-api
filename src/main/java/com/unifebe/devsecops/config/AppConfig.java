package com.unifebe.devsecops.config;

/**
 * Segredos de runtime (senha de banco, credenciais AWS, chave do gateway de
 * pagamento) NAO ficam mais gravados no codigo-fonte. Em producao, essas
 * variaveis de ambiente seriam injetadas por um cofre de segredos (Vault,
 * AWS Secrets Manager, Azure Key Vault) durante o deploy - nunca pelo
 * GITHUB_TOKEN, que e um segredo de CI/build, nao de runtime.
 */
public class AppConfig {

    public static final String DB_PASSWORD = System.getenv("DB_PASSWORD");

    public static final String AWS_ACCESS_KEY_ID = System.getenv("AWS_ACCESS_KEY_ID");
    public static final String AWS_SECRET_ACCESS_KEY = System.getenv("AWS_SECRET_ACCESS_KEY");

    public static final String PAYMENT_GATEWAY_API_KEY = System.getenv("PAYMENT_GATEWAY_API_KEY");

}
