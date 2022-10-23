package Staff.Exeptions;

public class DepositOfFoodIsFullException extends  Exception{
    public DepositOfFoodIsFullException(String message){
        super(message);
    }
}
