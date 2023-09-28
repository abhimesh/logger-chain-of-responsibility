public class info extends logProcessor{
    info(logProcessor nextlogProcessor) {
        super(nextlogProcessor);
    }
    public void log(int logType,String message)
    {
        if(logType==INFO)
        {
            System.out.println(message+ ":This is info log type" );
        }
        else {
            super.log(logType,message);
        }
    }
}
