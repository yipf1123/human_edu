package Day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *	DriverManager
 *  : 자바 프로그램을 JDBC 드라이버에 연결시켜주는 클래스 
 *  - getConnection( URL, DB계정, DB패스워드 )
 *    : DB에 연결을 하고, DB와 연결을 관리하는 객체인 Connection을 반환
 *    
 *  Connection
 *  : 연결된 드라이버에 SQL을 요청할 객체를 생성하는 클래스
 *    
 *  데이터베이스 사용에 필요한 클래스
 *  - Statement			 	: SQL을 실행하기 위해 사용하는 클래스
 *    * executeQuery(sql)	: 지정한 sql(SELECT) 을 실행하고 결과를 ResultSet 객체로 반환
 *    * executeUpdate(sql)	: 지정한 sql(INSERT, UPDATE, DELETE)을 실행하고
 *    						  적용된 데이터의 개수를 반환
 *     
 *  - PreparedStatement		: SQL 안에 파라미터를 지정하여 실행할 수 있는 확장기능을 제공하는 클래스
 *   * con.prepareStatement(sql)	: Connection 객체로 실행할 sql 을 지정하여,
 *   								  PrepareStatement 객체를 반환
 *   * String sql = "INSERT INTO board ( ~ ) VALUES ( ?, ?, ? )";
 *   * ? 파라미터에 매핑할 값을 setXXX() 메소드로 지정하여 사용할 수 있다
 *   * - 객체.setXXX(순서, 매핑할 값) 
 *   * 객체.executeQuery()	: Statement 와 동일
 *   * 객체.executeUpdate()	: Statement 와 동일
 *   
 *  - ResultSet				: SQL 실행 결과를 받아오는 객체
 *    * 첫 번째 데이터부터 시작하여 데이터를 커서로 하나씩 관리한다
 *    * next()				: 다음 데이터 이동
 *    * getXXX(index)		: 데이터를 특정 타입으로 반환하는 메소드
 *    						  - 현재 데이터의 index 위치에 있는 컬럼 값을 가져온다
 *    * getXXX("컬럼이름")		: 데이터를 특정 타입으로 반환하는 메소드
 *    					 	  - 컬럼이름으로 값을 가져온다
 *  
 *
 */
public class JDBConnection {
	
	public Connection con;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs;
	
	// 기본 생성자
	public JDBConnection() {
		
		try {
			// JDBC 드라이버 로드
			// MySQL
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			//ORACLE
			Class.forName("oracle.jdbc.OracleDriver");
			
		
			// DB 에 연결
			// - 연결에 필요한 정보 : URL, id, pw
			// URL : jdbc:mysql://도메인:[PORT]/[스키마]?옵션파라미터
			//     * 내 PC의 IP주소 :  localhost : 127.0.0.1  
			// MYSQL
			// String url = "jdbc:mysql://localhost:3306/human?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false";
			
			//Oracle
			//jdbc:oracle:thin			- JDBC 드라이버 타입( thin 타입)
			// @localhost 				- 호스트 주소( IP 주소), localhost 또는 127.0.0.1은 현재 PC를 의미
			// :1521					- 포트번호 (1521 은 오라클 DB서버의 기본 포트 번호이다.)
			// :xe 또는 orcl 				- SID (서비스 ID)
			// String url = "jdbc:oracle:thin:@localhost:1512:xe";	//11g
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl"; // 12c이상
			String id = "human";
			String pw = "123456";
			
			con = DriverManager.getConnection(url, id, pw);
			
			System.out.println("DB 연결 성공");
			
		} catch (Exception e) {
			System.err.println("DB 연결 실패");
			e.printStackTrace();
		}
		
		
	}
	
//	public static void main(String[] args) {
//		JDBConnection jc = new JDBConnection();
//	}
//	

}







