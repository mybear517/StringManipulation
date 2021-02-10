public class SqlApp {

	public SqlApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SqlApi sqlApi = new SqlApi();
		sqlApi.setSqlStatement("Select name, city from Emp where age > 20 and city = 'New York' order By name");

		System.out.println("1- Extract all words");
		String[] arr = sqlApi.getSqlStatement().split(" ");    

		for ( String ss : arr) {
			System.out.println(ss);
		}

		System.out.println("2-getProjectedField()-" + sqlApi.getProjectedField());
		System.out.println("3-     getTableName()-"+ sqlApi.getTableName());
		System.out.println("4-    getConditions()-"+ sqlApi.getConditions());
		System.out.println("5- getLogicOperator()-"+ sqlApi.getLogicOperator());
		System.out.println("6-       getOrderBy()-"+ sqlApi.getOrderBy());
		System.out.println("7-     getMainQuery()- "+ sqlApi.getMainQuery());
	}

}
