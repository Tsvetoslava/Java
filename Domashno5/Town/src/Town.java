/*Направете клас Town с полета Име, Държава и Население
Направете HashSet  с Тоwn и добавете 5 града
Проверете дали сета съдържа град с име, дръжава и 
население точно равни на първият създаден град
Премахнете град с име, дръжава и население точно равни на 3тия създаден град
 */

public class Town {
	String name;
	String durjava;
	int naselenie;

	public Town() {
		super();
	}

	public Town(String name, String durjava, int naselenie) {
		super();
		this.name = name;
		this.durjava = durjava;
		this.naselenie = naselenie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDurjava() {
		return durjava;
	}

	public void setDurjava(String durjava) {
		this.durjava = durjava;
	}

	public int getNaselenie() {
		return naselenie;
	}

	public void setNaselenie(int naselenie) {
		this.naselenie = naselenie;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((durjava == null) ? 0 : durjava.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + naselenie;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Town other = (Town) obj;
		if (durjava == null) {
			if (other.durjava != null)
				return false;
		} else if (!durjava.equals(other.durjava))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (naselenie != other.naselenie)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Town [name=" + name + ", durjava=" + durjava + ", naselenie="
				+ naselenie + "]";
	}
}
