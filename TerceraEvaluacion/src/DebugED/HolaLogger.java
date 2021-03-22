package DebugED;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HolaLogger {

	private final static Logger LOGGER = Logger.getLogger(HolaLogger.class.getName());

	public static void main(String[] args) throws SecurityException, IOException {
		HolaLogger ejemplo = new HolaLogger();
		ejemplo.configurarLog();
		ejemplo.escribirEnLog();
	}

	
	private void borrarConsolaPorDefecto() {
        Logger rootLogger = Logger.getLogger("");
        Handler[] handlers = rootLogger.getHandlers();
        if (handlers[0] instanceof ConsoleHandler) {
            rootLogger.removeHandler(handlers[0]);
        }
	}
	
	public void configurarLog() throws SecurityException, IOException {
		this.borrarConsolaPorDefecto();
		
		// Creamos un manejador por consola que lo muestra todo
		Handler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.ALL);
		LOGGER.addHandler(consoleHandler);
		
		// El manejador a fichero a partir de INFO
		Handler fileTxt = new FileHandler("logging.txt", true);	
		SimpleFormatter simpleFormatter = new SimpleFormatter();
		fileTxt.setFormatter(simpleFormatter);
		fileTxt.setLevel(Level.INFO);
		LOGGER.addHandler(fileTxt);
		
		LOGGER.setLevel(Level.FINE);
	}

	public void escribirEnLog() {
		LOGGER.config("Mensaje de configuraci�n");
		LOGGER.fine("Depurando el programa");
		LOGGER.warning("Se ha lanzado una excepci�n");
		LOGGER.severe("No se ha podido conectar con la Base de Datos");
		LOGGER.log(Level.FINEST, "Depuraci�n m�s fina");
		LOGGER.log(Level.INFO, "El log se ha probado correctamente");
	}
}
