package 資料結構;

public class homework1 {
	

	public static void main(String[] args) {
		
		double low = 0; //地面下(左端的位置，高度是負數)
		double high =1;	//地面上(右端的位置，高度是正數)
		double threshold = 0.0001; //容許誤差
		
		while(true) {
			double middle = (low + high) / 2; //中間位置
			double value = middle - Math.exp(-middle);  //中點Y的高度
			
			if(Math.abs(value)< threshold) {	//如果(高度離 0 的距離小於容許誤差
				System.out.println("x=" + middle); 	//印出X的位置
				break;
			}
			
			if(value < 0) {	//如果中點Y的高度是負數
				low = middle;	//左端位置改成中點
			}else {
				high = middle; //右端位置改成終點
			}
			
		}

	}

}
