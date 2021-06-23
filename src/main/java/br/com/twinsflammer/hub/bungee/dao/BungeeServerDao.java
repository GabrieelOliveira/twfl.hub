package br.com.twinsflammer.hub.bungee.dao;

import br.com.twinsflammer.api.shared.databases.mysql.dao.Table;

/**
 * @author Gabrieel
 */
public class BungeeServerDao extends Table {

    @Override
    public String getDatabaseName() {
        return "general";
    }

    @Override
    public String getTableName() {
        return "server_hub";
    }

    @Override
    public void createTable() {
        this.execute(
                String.format(
                        "CREATE TABLE IF NOT EXISTS %s" +
                                "(" +
                                "`name` VARCHAR(16) NOT NULL," +
                                "`display_name` VARCHAR(16) NOT NULL," +
                                "`unique_id` VARCHAR(255) NOT NULL," +
                                "`password` VARCHAR(255)," +
                                "`first_login` LONG," +
                                "`last_login` LONG," +
                                "`last_address` VARCHAR(255)," +
                                "`last_lobby_id` INTEGER" +
                                ");",
                        this.getTableName()
                )
        );
    }

}
