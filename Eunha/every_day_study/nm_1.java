package every_day_study;

import java.util.Scanner;

public class nm_1 {
	
	static int n;
	static int m;
	static int[] ans;
	static boolean[] visited;
	
	public static void main(String[] args) {
		
   Scanner sc = new Scanner(System.in);
   
   n=sc.nextInt();
   m=sc.nextInt();

   ans = new int[m];
   visited = new boolean[n+1];
   
   array(0);
  
	}//메인 끝
	
	static void array(int idx) {
			
		//종료
		if(idx ==m) {//*ans[m+1]하니까 인덱스는 m까지 존재하는거지. 
			//*그리고 이 종료조건이 앞에 있으니까 이미 m-1까지 다 채워지고 이번턴에 m이 되면 그 전까지 출력
			
		for(int i=0;i<m;i++) {
			System.out.print(ans[i]+" ");
			
		}
		System.out.println();
		return; //*for문으로 ans배열 안에 인덱스를 다 출력하고 return하려면 여기에 위치. 
		}
		
		//재귀
		for(int i=1;i<=n;i++) {
			if(!visited[i]) {//*visited가 false인 것들에 한해서 변경해야함. 
				
			ans[idx] = i;
			visited[i] = true;
			
			array(idx+1);
			
			visited[i] = false;
			}
		}
	}//array함수 끝
	
}//클래스 끝
//3시 13분
