package quant.attendance.prefs

/**
 * Created by cz on 2017/2/24.
 */
class FilePrefs {
    final static def APP_NAME="Attendance"
    final static def CONFIG_PATH="$APP_NAME/config"
    final static def DB_PATH="$APP_NAME/database"
    final static def HOLIDAY="$APP_NAME/holiday"

    public final static File CONFIG_FOLDER=new File(System.properties["user.home"],CONFIG_PATH)
    public final static File DATABASE_FOLDER=new File(System.properties["user.home"],DB_PATH)
    public final static File HOLIDAY_FOLDER=new File(System.properties["user.home"],HOLIDAY)

    static {
        ensureFolder(CONFIG_FOLDER, DATABASE_FOLDER,HOLIDAY_FOLDER)
    }

    static def ensureFolder(File...folder){
        if(folder){
            folder.each { it.exists() ?: it.mkdirs() }
        }
    }
}
