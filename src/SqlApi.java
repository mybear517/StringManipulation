public class SqlApi {
	private String sqlStatement;
	public SqlApi() {
		// TODO Auto-generated constructor stub
	}

	public void setSqlStatement(String stmt) {
		sqlStatement = stmt.toLowerCase();
	}
	public String getSqlStatement() {
		return sqlStatement;
	}

	public String getProjectedField() {
		String[] arr1 = sqlStatement.split("select ");
		String[] arr2 = arr1[1].split(" from ");
		return arr2[0];
	}
	public String getTableName() {
		String[] arr1 = sqlStatement.split(" from ");
		String[] arr2 = arr1[1].split(" ");
		return arr2[0];
	}
	public String getConditions() {
		String[] arr1 = sqlStatement.split(" where ");
		String[] arr2 = arr1[1].split(" order by ");
		return arr2[0];
	}
	public String getLogicOperator() {
		if(sqlStatement.contains("and")) {
			return " and";
		} else if(sqlStatement.contains("or")) {
			return " or";
		}
		return " unknown";

	}
	public String getOrderBy() {
		String[] arr1 = sqlStatement.split(" order by ");
		String[] arr2 = arr1[1].split(" ");
		return arr2[0];
	}
	public String getMainQuery() {
		String[] arr1 = sqlStatement.split(" where ");
		return arr1[0];
	}

}
