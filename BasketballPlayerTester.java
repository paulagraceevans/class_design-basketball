enum Position { PointGuard, ShootingGuard, SmallForward, PowerForward, Center}
public class BasketballPlayerTester
{
    public static void main()
    {
        BasketballPlayer p1 = new BasketballPlayer("Bill Thill the Deadly", Position.ShootingGuard, 23, .432, 3.5);
        p1.setHeight(68);
        p1.setWeight(125);
        System.out.println(p1.getName() + " is eligible to play: "+p1.eligibleToPlay());
        p1.setTotalPoints (32);
        p1.scoreFreeThrow();
        System.out.println(p1.getName() + "  has: "+p1.getTotalPoints()+" points.");
        p1.scoreBasket();
        System.out.println(p1.getName() + "  has: "+p1.getTotalPoints()+" points.");
        p1.scoreFromDowntown();
        System.out.println(p1.getName() + "  has: "+p1.getTotalPoints()+" points.");
        
    }
        
}
