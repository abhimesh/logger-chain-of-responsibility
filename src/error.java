public class error extends  logProcessor{
    error(logProcessor nextlogProcessor) {
        super(nextlogProcessor);
    }
    public void log(int logType,String message)
    {
        if(logType==ERROR)
        {
            System.out.println(message+ ":This is error log type" );
        }
        else {
            super.log(logType,message);
        }
    }

}
