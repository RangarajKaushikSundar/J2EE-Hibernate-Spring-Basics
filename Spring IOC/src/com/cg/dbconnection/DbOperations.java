package com.cg.dbconnection;

public class DbOperations {
		private DbConnection dbConnection;

		public DbConnection getDbConnection() {
			return dbConnection;
		}

		public void setDbConnection(DbConnection dbConnection) {
			this.dbConnection = dbConnection;
		}
		public int getCount(){
			return dbConnection.getCount();
		}
}
