package exercise;

import java.util.HashMap;
import java.util.Map;

/*
 * 两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。
 * 已抽签决定比赛名单。有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单
 */
public class Program018 {
	public static void main(String []args){
		Map<Character, Character> pairs = new HashMap<Character, Character>();
		char[] teamA = {'a', 'b', 'c'};
		char[] teamB = {'x', 'y', 'z'};
		for(int i=0; i<teamA.length; i++){
			for(int j=0; j<teamB.length; j++){
				if(teamA[i]=='a' && teamB[j]=='x'){
					continue;
				}
				if(teamA[i]=='c' && (teamB[j]=='x' || teamB[j]=='z')){
					continue;
				}
				pairs.put(teamA[i], teamB[j]);
			}
		}
		System.out.println(pairs);
	}
}

 