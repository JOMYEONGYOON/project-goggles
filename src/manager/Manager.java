package manager;

public class Manager {
	private ResourceManager ResourceManager;
	private DatabaseManager databaseManager;
	public Manager() {
		ResourceManager = new ResourceManager();
		databaseManager = new DatabaseManager();
	}
	public ResourceManager getResourceManager() {
		return ResourceManager;
	}
	public void setResourceManager(ResourceManager ResourceManager) {
		this.ResourceManager = ResourceManager;
	}
	public DatabaseManager getDatabaseManager() {
		return databaseManager;
	}
	public void setDatabaseManager(DatabaseManager databaseManager) {
		this.databaseManager = databaseManager;
	}
	
}
