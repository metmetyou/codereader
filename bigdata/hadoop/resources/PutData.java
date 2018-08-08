import java.sql.Connection;
import java.sql.PreparedStatement;

import datamigration.dao.DBConnectionManager;

/*
||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
||						   _ooOoo_                                ||
||						  o8888888o                               ||
||                        88" . "88                               ||
||                        (| ^_^ |)                               ||
||                        O\  =  /O                               ||
||                     ____/`---'\____                            ||
||                   .'  \\|     |//  `.                          ||
||                  /  \\|||  :  |||//  \                         ||
||                 /  _||||| -:- |||||-  \                        ||
||                 |   | \\\  -  /// |   |                        ||
||                 | \_|  ''\---/''  |   |                        ||
||                 \  .-\__  `-`  ___/-. /                        ||
||               ___`. .'  /--.--\  `. . ___                      ||
||             ."" '<  `.___\_<|>_/___.'  >'"".                   ||
||            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 ||
||            \  \ `-.   \_ __\ /__ _/   .-` /  /                 ||
||     ========`-.____`-.___\_____/___.-`____.-'========          ||
||                          `=---='                               ||
||     ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^         ||
||              佛祖保佑              永无BUG      永不修改                                              ||
||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
*/

public class PutData {
	
	public static void putDataToKingbase(String sql) {
		
		Connection con = null;

		PreparedStatement pst = null;

		String insertSql =sql;

		try {
			con = DBConnectionManager.getInstance().getConnection("jincang");
			pst = con.prepareStatement(insertSql);
			pst.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				DBConnectionManager.getInstance().freeConnection("jincang", con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	

}