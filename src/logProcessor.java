public abstract class logProcessor {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;
    logProcessor nextlogProcessor;
    logProcessor(logProcessor nextlogProcessor)
    {
        this.nextlogProcessor=nextlogProcessor;
    }
    public void log(int logType,String Message)
    {
        if(nextlogProcessor!=null)
        {
            nextlogProcessor.log(logType,Message);
        }
    }
}
