-- Dump da tabela `usuario`

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
                           `id` BIGINT NOT NULL AUTO_INCREMENT,
                           `cpf` VARCHAR(255) DEFAULT NULL,
                           `endereco` VARCHAR(255) DEFAULT NULL,
                           `entidade_empregadora` VARCHAR(255) DEFAULT NULL,
                           `nome` VARCHAR(255) DEFAULT NULL,
                           `profissao` VARCHAR(255) DEFAULT NULL,
                           `rendimento1` DOUBLE DEFAULT NULL,
                           `rendimento2` DOUBLE DEFAULT NULL,
                           `rendimento3` DOUBLE DEFAULT NULL,
                           `rg` VARCHAR(255) DEFAULT NULL,
                           `tipo_usuario` VARCHAR(255) DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dump da tabela `automovel`

DROP TABLE IF EXISTS `automovel`;

CREATE TABLE automovel (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           ano INT NOT NULL,
                           marca VARCHAR(50) NOT NULL,
                           modelo VARCHAR(50) NOT NULL,
                           placa VARCHAR(10) NOT NULL
);

-- Dump da tabela `pedido`

DROP TABLE IF EXISTS `pedido`;

CREATE TABLE `pedido` (
                          `id` BIGINT NOT NULL AUTO_INCREMENT,
                          `cliente_id` BIGINT NOT NULL,
                          `automovel_id` BIGINT NOT NULL,
                          `status` VARCHAR(255) DEFAULT NULL,
                          `data_pedido` DATE NOT NULL,
                          PRIMARY KEY (`id`),
                          FOREIGN KEY (`cliente_id`) REFERENCES `usuario`(`id`) ON DELETE CASCADE,
                          FOREIGN KEY (`automovel_id`) REFERENCES `automovel`(`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

LOCK TABLES `usuario` WRITE;
LOCK TABLES `automovel` WRITE;
LOCK TABLES `pedido` WRITE;

UNLOCK TABLES;
