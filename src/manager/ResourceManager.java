package manager;

public class ResourceManager{
	private String particleImagePath;
	
	public String getParticleImagePath() {
		return particleImagePath;
	}

	public void setParticleImagePath(String particleImagePath) {
		this.particleImagePath = particleImagePath;
	}

	public ResourceManager() {
		System.out.println(System.getProperty("user.dir"));
	}

	public static void main(String[] args) {
		new ResourceManager();
	}
}