package jp.tokyo.selj.view;

import java.awt.Cursor;
import java.awt.event.KeyEvent;

public class Util {
    public static Cursor WAIT_CURSOR = Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR);
    static boolean mac_os_flg;
    
    static{
		String os_name = System.getProperty("os.name");
		mac_os_flg = os_name.toUpperCase().indexOf("MAC") > -1;
    }
    
	public static String getClassName(Object o){
		return getClassName(o.getClass());
	}
	public static String getClassName(Class clazz){
		String src = clazz.getName();
		String[] split = src.split("\\.");
		return split[split.length-1];
	}
	public static boolean isMacOS(){
		return mac_os_flg;
	}
	public static int keyEvent_ctrl(){
		if(Util.isMacOS()){
			return KeyEvent.CTRL_DOWN_MASK;
		}else{
			return KeyEvent.CTRL_MASK;
		}
	}
	public static String keyEvent_ctrl_str(){
		if(Util.isMacOS()){
			return "command";
		}else{
			return "ctrl";
		}
	}
	public static int keyEvent_delete(){
		if(Util.isMacOS()){
			return 8;	// MAC delete key
		}else{
			return KeyEvent.VK_DELETE;
		}
	}
	public static int keyModify_ctrl(){
		if(Util.isMacOS()){
			return 4;	// MAC command key
		}else{
			return KeyEvent.CTRL_MASK;
		}
	}
}
