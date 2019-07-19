package be.pxl.h17.oef3;

	import java.util.Scanner;

	public class Bankrekening {
		private String rekeningNummer, naam;
		private double saldo, rente;
		Scanner s1 = new Scanner(System.in);
		private boolean chek;

		public Bankrekening(String rekeningNummer, String naam, double saldo,
				double rente) {
			this.rekeningNummer = rekeningNummer;
			this.naam = naam;
			controleBedragen(saldo, rente);
		}

		public Bankrekening() {
			this("geen", "onbekend", 0, 1.2);

		}
		
		public String getNaam() {
			return naam;
		}

		public void setRekeningNummer(String rekeningNummer) {
			this.rekeningNummer = rekeningNummer;
		}

		public void setNaam(String naam) {
			this.naam = naam;
		}

		private void controleBedragen(double saldo, double rente) {
			if (saldo < 0) {
				this.saldo = 0;
			} else {
				this.saldo = saldo;
			}

			if (rente < 0) {
				this.rente = 0;
			} else {
				this.rente = rente;
			}

		}
		public double getSaldo() {
			return saldo;
		}
		public String getrekeningNummer(){
			return rekeningNummer;
		}
		public void stort(double saldo) {
			chek = controle();
			if (chek == true) {
				this.saldo = this.saldo + saldo;
				System.out.printf("na storting van %.2f euro %n" , saldo);
				print();
			}
		}
		public void neemOp(double saldo) {
			chek = controle();
			if (chek == true) {
				if (this.saldo <= 0) {
					System.out.println("u kan geen geld opnemen");
				}
				if ((this.saldo - saldo < 0)) {
					System.out.printf(
							"het saldo is %.2f en je wilt %.2f afhalen %n",
							this.saldo, saldo);
					double afhalen = this.saldo;
					this.saldo = this.saldo - afhalen;
					System.out.printf("na opname van %.2f euro %n" , afhalen);
					print();

				} else {
					this.saldo = this.saldo - saldo;
					System.out.printf("na opname van %.2f euro %n" , saldo);
					print();
				}
			}
		}

		public void verrichting(double... verichtingen) {
			chek = controle();
			if (chek == true) {
				for (double ver : verichtingen) {
					if (ver < 0) {
						neemOp(-ver);
					} else {
						stort(ver);
					}
				}
			}
		}

		public void schrijfRenteBij() {
			chek = controle();
			if (chek == true) {
				double rentebonus = (this.saldo * rente/100);
				this.saldo = this.saldo + rentebonus ;
				System.out.printf("rente word bijgeschreven van %.2f euro %n" , rentebonus);
				print();
			}
		}
		public boolean controle() {
			boolean bool;
			if (this.naam.equals("onbekend")) {
				System.out.println("geef je naam in");
				this.naam = s1.nextLine();
			}
			if (!this.rekeningNummer.equals("geen")) {
				bool = true;
			} else {
				bool = false;
				System.out.println("sorry geen rekeningNummer");
			}
			return bool;
		}
		
		public void print(){
			System.out.printf("saldo op spaarrekening %s op naam van %s bedraagt %.2f %n" , this.rekeningNummer, this.naam,this.saldo);
		}

	}

