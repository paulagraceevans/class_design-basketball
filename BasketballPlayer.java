enum Position { PointGuard, ShootingGuard, SmallForward, PowerForward, Center}

public class BasketballPlayer
{
    private String name;
    private double height;
    private  double weight;
    private  int jerseyNumber;
    private Position position;
    private int fouls;
    private int totalPoints;
    private double fieldGoalPercent;
    private double GPA;

    public BasketballPlayer()
    {
        this.name = "No Name given";
        this.position = null;
        this.jerseyNumber = -1;
        this.fieldGoalPercent = 0.0;
        this.GPA = 3.0;
        height = 0;
        weight = 0;
        fouls = 0;
        totalPoints = 0; 
    }

    public BasketballPlayer(String name, Position position, int jerseyNumber, double fieldGoalPercent, double GPA)
    {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.fieldGoalPercent = fieldGoalPercent;
        this.GPA = GPA;
        height = 0;
        weight = 0;
        fouls = 0;
        totalPoints = 0; 
    }

    public boolean fouledOut()
    {
        if (fouls == 5)
        {
            return true;
        }

        return false;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setWeight( double weight)
    {
        this.weight = weight;
    }

    public void setJerseyNumber( int jerseyNumber)
    {
        this.jerseyNumber = jerseyNumber;
    }

    public void setPosition(Position position)
    {
        this.position = position;
    }

    public void setFouls(int fouls)
    {
        this.fouls = fouls;
    }

    public void setTotalPoints(int totalPoints)
    {
        this.totalPoints = totalPoints;
    }

    public void setFieldGoalPercent(double fieldGoalPercent)
    {
        this.fieldGoalPercent = fieldGoalPercent;

    }

    public void setGPA(double GPA)
    {
        this.GPA = GPA;
    }

    public String getName()
    {
        return name;
    }

    public double getHeight()
    {
        return height;
    }

    public double getWeight()
    {
        return weight;
    }

    public int getJerseyNumber( )
    {
        return jerseyNumber;
    }

    public Position getPosition()
    {
        return position;
    }

    public int getFouls()
    {
        return fouls;
    }

    public int getTotalPoints()
    {
        return totalPoints;
    }

    public double setFieldGoalPercent()
    {
        return fieldGoalPercent;

    }

    public double setGPA()
    {
        return GPA;
    }

    public double calculateBMI()
    {
        return (0.45*this.getWeight()/(Math.pow(0.025*this.getHeight(), 2)));
    }

    public boolean eligibleToPlay()
    {
        return ( GPA >= 2.9 && ((this.calculateBMI() >= 19)&&( this.calculateBMI() <=  25)));
    }

    public void scoreFreeThrow()
    {
        totalPoints ++; 
    }

    public void scoreBasket()
    {
        totalPoints += 2 ; 
    }


    public void scoreFromDowntown()
    {
        totalPoints += 3 ; 
    }
}
