package br.com.leonardo.model;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Dates {

	public void timeForPc() {
//		 font https://blog.caelum.com.br/conheca-a-nova-api-de-datas-do-java-8/
		Instant now = Instant.now();
		System.out.println("Now :" + now);
		System.out.println();
//		For banthmark aplication

		Instant init = Instant.now();
		runAplication();
		Instant end = Instant.now();

		Duration duration = Duration.between(init, end);
		Long durationInMileSeconds = duration.toMillis();
		System.out.println("Duration : " + duration);
		System.out.println();
		System.out.println("Duration MS : " + durationInMileSeconds);
		System.out.println("-------------------------");
	}

	private void runAplication() {
		Collection<Integer> number = new ArrayList<>();

		for (int i = 1; i <= 50000; i++) {
			number.add(i);
		}
	}

	public void timeForPeople() {
		System.out.println("Time People");
		LocalDate now = LocalDate.now();
		System.out.println("Today is : " + now);
		System.out.println();

		LocalDate birtday = LocalDate.of(1997, 6, 17);
		System.out.println("BirtDay :" + birtday);
		System.out.println();

		LocalDate manInSpace = LocalDate.of(1961, Month.APRIL, 12);
		LocalDate manInMoon = LocalDate.of(1969, Month.MAY, 25);

		Period period = Period.between(manInSpace, manInMoon);
		System.out.println("man in Space of man in Moon");
		System.out.printf("%s Years, %s months e %s days", period.getYears(), period.getMonths(), period.getDays());
		System.out.println();

		LocalTime entry = LocalTime.of(9, 00);
		System.out.println("Entry :" + entry);
		System.out.println();

		LocalDateTime nowTime = LocalDateTime.now();
		LocalDateTime InitForWordCup = LocalDateTime.of(2022, Month.NOVEMBER, 21, 17, 0);
		System.out.println("Time now : " + nowTime);
		System.out.println("Time for Word Cup FIFA : " + InitForWordCup);
		System.out.println();

		ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime agoraEmSaoPaulo = ZonedDateTime.now(fusoHorarioDeSaoPaulo);
		System.out.println("Time zone SAO PAULO " + agoraEmSaoPaulo);

		ZoneId fusoHorarioDeSaoPauloVoo = ZoneId.of("America/Sao_Paulo");
		ZoneId fusoHorarioDeNovaYork = ZoneId.of("America/New_York");

		LocalDateTime saidaDeSaoPauloSemFusoHorario = LocalDateTime.of(2014, Month.APRIL, 4, 22, 30);
		LocalDateTime chegadaEmNovaYorkSemFusoHorario = LocalDateTime.of(2014, Month.APRIL, 5, 7, 10);

		ZonedDateTime saidaDeSaoPauloComFusoHorario = ZonedDateTime.of(saidaDeSaoPauloSemFusoHorario,
				fusoHorarioDeSaoPauloVoo);
		System.out.println("takeoff São Paulo" + saidaDeSaoPauloComFusoHorario);

		ZonedDateTime chegadaEmNovaYorkComFusoHorario = ZonedDateTime.of(chegadaEmNovaYorkSemFusoHorario,
				fusoHorarioDeNovaYork);
		System.out.println("Landing in New York " + chegadaEmNovaYorkComFusoHorario);

		Duration duracaoDoVoo = Duration.between(saidaDeSaoPauloComFusoHorario, chegadaEmNovaYorkComFusoHorario);
		System.out.println("Duranterion Flay " + duracaoDoVoo); // PT9H40M
		System.out.println();

		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatador));
		
		
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatadorEnum = DateTimeFormatter
			.ofLocalizedDateTime(FormatStyle.SHORT)
			.withLocale(new Locale("pt", "br"));
		System.out.println(agora.format(formatadorEnum)); 
		System.out.println();
		
		LocalDate hojeManipulado = LocalDate.now();
		LocalDate amanha = hojeManipulado.plusDays(11);
		System.out.println(amanha.format(formatador));
		
		

	}
}
