import java.util.UUID;

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

/**
 * 
 * @author dp
 * CreateUUID一共有三个成员函数
 * getUUID返回一个32位长度的uuid不带‘-’符合
 * uuid（）在控制台输出两个不带‘-’符号的32uuid
 * UUID(int a) 返回输入参数个数的uuid，uuid格式同上
 *
 */

public  final class CreateUUID {

	
	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}
	
	public static void UUID() {
		for(int i =0 ; i < 2; i++) {
			String a =UUID.randomUUID().toString().replace("-", "");
			System.out.println(a);
			}
	}
	
	public static void UUID(int a) {
		if(a <=0) {
			System.out.println("参数输入错误");
		}{
		for(int i=0; i < a; i++) {
			String b =UUID.randomUUID().toString().replace("-", "");
			System.out.println(b);
		}
		}
	}
	
	
	public static void main(String[] args) {
		UUID();
	}
	

}