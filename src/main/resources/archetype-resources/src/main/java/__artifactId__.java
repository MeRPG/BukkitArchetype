#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.bukkit.plugin.java.JavaPlugin;

public class ${artifactId} extends JavaPlugin {
    private static ${artifactId} instance;

    public void onEnable() {
        instance = this;
    }
}