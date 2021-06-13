import org.apache.commons.lang3.SystemUtils;

public final class DriverUtils {

    private static final String CHROMEDRIVER_LINUX_PATH = "drivers/chrome/linux-driver";
    private static final String CHROMEDRIVER_WINDOWS_PATH = "drivers/chrome/windows-driver.exe";
    private static final String CHROMEDRIVER_MAC_PATH = "drivers/chrome/mac-driver";

    public static String setChromeDriver(){
        if(SystemUtils.IS_OS_LINUX)
            return CHROMEDRIVER_LINUX_PATH;
        if(SystemUtils.IS_OS_WINDOWS)
            return CHROMEDRIVER_WINDOWS_PATH;
        if(SystemUtils.IS_OS_MAC)
            return CHROMEDRIVER_MAC_PATH;
        return null;
    }
}
