-- Dump da tabela `usuario`

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
                           `id` bigint NOT NULL AUTO_INCREMENT,
                           `cpf` varchar(255) DEFAULT NULL,
                           `endereco` varchar(255) DEFAULT NULL,
                           `entidade_empregadora` varchar(255) DEFAULT NULL,
                           `nome` varchar(255) DEFAULT NULL,
                           `profissao` varchar(255) DEFAULT NULL,
                           `rendimento1` double DEFAULT NULL,
                           `rendimento2` double DEFAULT NULL,
                           `rendimento3` double DEFAULT NULL,
                           `rg` varchar(255) DEFAULT NULL,
                           `tipo_usuario` varchar(255) DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;



LOCK TABLES `usuario` WRITE;



UNLOCK TABLES;
