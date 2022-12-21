import java.util.Random;

public class ScoreDemo {
	public static void main(String[] args) {
		System.out.println("PLAYERUNKNOWN'S BATTLEGROUNDS");
		Random random=new Random();
		MatchType match1=new MatchType("PUBG", "Solo", "TeamDeathMatch");
		
		//MatchType.player.add(new MatchType("Far Cry 2","Nitro Rex(Pan) vs Mortal(Grenade)",71,17));
		//MatchType.player.add(new MatchType("Far Cry 2","Ron(M4) vs Rowdy(AKM-47)",random.nextInt(50),random.nextInt(50)));
		//MatchType.player.add(new MatchType("Far Cry 2","Dynamo(Kar98) vs Shroud(AWM)",random.nextInt(60),random.nextInt(60)));

		System.out.println(match1.getGameDetail());
		for(MatchType i:MatchType.player){
			System.out.println(i);
		}
	}
}
/*
Output:

Game Name: PUBG
Game Type: Solo
Match Type: TeamDeathMatch

Players: Nitro Rex(Pan) vs Mortal(Grenade)
Kill(Team 1): 71
Kill(Team 2): 17
Winner: Team 1 won            

Players: Ron(M4) vs Rowdy(AKM-47)
Kill(Team 1): --(random value)
Kill(Team 2): --(random value)
Winner: Team -- won

Players: Dynamo(Kar98) vs Shroud(AWM)
Kill(Team 1): --(random value)
Kill(Team 2): --(random value)
Winner: Team -- won
*/