package com.TopicaRP.WorldTools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

public class PropertiesFile {
	  private static final Logger log = Logger.getLogger("Minecraft");
	    private String fileName;
	    private Properties props = new Properties();


	    public PropertiesFile(String fileName) {
	        this.fileName = fileName;

	        File file = new File(fileName);

	        try {
	            if (file.exists()) {
	                load();
	            } else {
	                save();
	            }
	        } catch (IOException ex) {
	            log.severe("[PropertiesFile] Unable to load " + fileName + "!");
	        }
	    }


	    public void load() throws IOException {
	        FileInputStream stream = null;

	        try {
	            stream = new FileInputStream(fileName);
	            props.load(stream);
	        } catch (IOException ex) {} finally {
	            try {
	                if (stream != null) {
	                    stream.close();
	                }
	            } catch (IOException ex) {}
	        }
	    }


	    public void save() {
	        FileOutputStream stream = null;

	        try {
	            stream = new FileOutputStream(fileName);
	            props.store(stream, null);
	        } catch (IOException ex) {} finally {
	            try {
	                if (stream != null) {
	                    stream.close();
	                }
	            } catch (IOException ex) {}
	        }
	    }


	    @SuppressWarnings("unchecked")
		public Map<String, String> returnMap() throws Exception {
	        return (Map<String, String>) props.clone();
	    }


	    public boolean containsKey(String var) {
	        return props.containsKey(var);
	    }


	    public String getProperty(String var) {
	        return props.getProperty(var);
	    }


	    public void removeKey(String var) {
	        if (props.containsKey(var)) {
	            props.remove(var);
	            save();
	        }
	    }

	 
	    public boolean keyExists(String key) {
	        return containsKey(key);
	    }


	    public String getString(String key) {
	        if (containsKey(key)) {
	            return getProperty(key);
	        }

	        return "";
	    }


	    public String getString(String key, String value) {
	        if (containsKey(key)) {
	            return getProperty(key);
	        }

	        setString(key, value);
	        return value;
	    }


	    public void setString(String key, String value) {
	        props.put(key, value);
	        save();
	    }


	    public int getInt(String key) {
	        if (containsKey(key)) {
	            return Integer.parseInt(getProperty(key));
	        }

	        return 0;
	    }


	    public int getInt(String key, int value) {
	        if (containsKey(key)) {
	            return Integer.parseInt(getProperty(key));
	        }

	        setInt(key, value);
	        return value;

	    }


	    public void setInt(String key, int value) {
	        props.put(key, String.valueOf(value));

	        save();
	    }


	    public double getDouble(String key) {
	        if (containsKey(key)) {
	            return Double.parseDouble(getProperty(key));
	        }

	        return 0;
	    }


	    public double getDouble(String key, double value) {
	        if (containsKey(key)) {
	            return Double.parseDouble(getProperty(key));
	        }

	        setDouble(key, value);
	        return value;
	    }


	    public void setDouble(String key, double value) {
	        props.put(key, String.valueOf(value));

	        save();
	    }


	    public long getLong(String key) {
	        if (containsKey(key)) {
	            return Long.parseLong(getProperty(key));
	        }

	        return 0;
	    }

	    public long getLong(String key, long value) {
	        if (containsKey(key)) {
	            return Long.parseLong(getProperty(key));
	        }

	        setLong(key, value);
	        return value;
	    }

	    public void setLong(String key, long value) {
	        props.put(key, String.valueOf(value));

	        save();
	    }

	    public boolean getBoolean(String key) {
	        if (containsKey(key)) {
	            return Boolean.parseBoolean(getProperty(key));
	        }

	        return false;
	    }

	    public boolean getBoolean(String key, boolean value) {
	        if (containsKey(key)) {
	            return Boolean.parseBoolean(getProperty(key));
	        }

	        setBoolean(key, value);
	        return value;
	    }

	    public void setBoolean(String key, boolean value) {
	        props.put(key, String.valueOf(value));

	        save();
	    }
}
//end of class