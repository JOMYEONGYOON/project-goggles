package manager;

public class ResourceManager {
	private String particleImagePath = "resources\\image\\particle.jpg";
	private String projectPath;

	public String getParticleImagePath() {
		return particleImagePath;
	}

	public void setParticleImagePath(String particleImagePath) {
		this.particleImagePath = particleImagePath;
	}

	public ResourceManager() {
		projectPath = System.getProperty("user.dir");
		particleImagePath = projectPath+"\\" + particleImagePath;
		System.out.println(particleImagePath);
	}

	public static void main(String[] args) {
		new ResourceManager();
	}
}