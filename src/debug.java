public class debug extends logProcessor{
    debug(logProcessor nextlogProcessor) {
        super(nextlogProcessor);
    }
    public void log(int logType,String message)
    {
        if(logType==DEBUG)
        {
            System.out.println(message+ ": This is debug log type" );
        }
        else {
            super.log(logType,message);
        }
    }

}
