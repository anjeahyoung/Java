package ch07.ex04.case05;

import ch07.ex02.presentation.Console;
import ch07.ex04.case05.Dao.ScoreDao;
import ch07.ex04.case05.Dao.ScoreDaoImpl;
import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.presentation.ScoreIo;
import ch07.ex04.case05.service.ScoreService;
import ch07.ex04.case05.service.ScoreServiceImpl;

public class Main {
	public static void main(String[] args) {
		ScoreDao scoreDao = new ScoreDaoImpl(new Score[5]);
		ScoreService scoreService = new ScoreServiceImpl(scoreDao);
		ScoreIo scoreIo = new ScoreIo(scoreService);
		
		scoreIo.play();
		Console.info("끝");
	}
}


//과제: 5명의 국영수 점수를 user가 입력토록 하라.
//interface Console 을 만든다.