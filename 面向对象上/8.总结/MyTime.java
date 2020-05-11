
public class MyTime {
//	定义三个整型成员变量并声明私有：（hour），分（minute），秒（second）
	static private int hour;
	static private int minute;
	static private int second;
	
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}

	public MyTime() {
		
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
//	addSecond(int sec)
	public int addSecond(int sec) {
		second = second + sec;
		return second;
	}
//	addMinute(int min)
	public int addMinute(int min) {
		minute = minute + min;
		return minute;
	}
//	addHour(int hou)
	public int addHour(int hou) {
		hour = hour + hou;
		return hour;
	}
//	subSecond(int sec)
	public int subSecond(int  sec) {
		second = second - sec;
		return second;
	}
//	subMinute(int min)
	public int subMinute(int min) {
		minute = minute - min;
		return minute;
	}
//	subHour(int hou)
	public int subHour(int hou) {
		hour = hour - hou;
		return hour;
	}
}
