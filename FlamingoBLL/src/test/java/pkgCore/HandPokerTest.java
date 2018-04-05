package pkgCore;
import static org.junit.Assert.*;
import org.junit.Test;
import pkgEnum.eRank;
import pkgEnum.eSuit;
public class HandPokerTest {

	@Test
	public void FourOfAKindTest1() {
		System.out.println("Four of a Kind");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.TWO));
		hp.AddCard(new Card(eSuit.SPADES,eRank.TWO));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.ScoreHand();
		System.out.println("");
		assertEquals(hp.isFourOfAKind(),true);
	}
	
	@Test
	public void FourOfAKindTest2() {
		System.out.println("Four of a Kind");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.KING));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.KING));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.KING));
		hp.AddCard(new Card(eSuit.SPADES,eRank.KING));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.ScoreHand();
		System.out.println("");
		assertEquals(hp.isFourOfAKind(),true);
	}
	
	@Test
	public void ThreeOfAKindTest1() {
		System.out.println("Three of a Kind");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.TWO));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.ScoreHand();
		System.out.println("");
		assertEquals(hp.isThreeOfAKind(),true);
	}
	
	@Test
	public void ThreeOfAKindTest2() {
		System.out.println("Three of a Kind");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.SPADES,eRank.ACE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.SEVEN));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.SEVEN));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.SEVEN));
		hp.ScoreHand();
		System.out.println("");
		assertEquals(hp.isThreeOfAKind(),true);
	}
	
	@Test
	public void FullHouseTest1() {
		System.out.println("Full House");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.ScoreHand();
		System.out.println("");
		assertEquals(hp.isFullHouse(),true);
	}

	@Test
	public void FullHouseTest2() {
		System.out.println("Full House");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.ACE));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.NINE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.NINE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.NINE));
		hp.ScoreHand();
		System.out.println("");
		assertEquals(hp.isFullHouse(),true);
	}
	
	@Test
	public void RoyalFlushTest1() {
		System.out.println("Royal FLush");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TEN));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.JACK));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.QUEEN));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.KING));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.ACE));
		hp.ScoreHand();
		System.out.println("");
		assertEquals(hp.isRoyalFlush(),true);
	}
	
	@Test
	public void StraightFlushTest1() {
		System.out.println("Straight FLush");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.SPADES,eRank.SEVEN));
		hp.AddCard(new Card(eSuit.SPADES,eRank.EIGHT));
		hp.AddCard(new Card(eSuit.SPADES,eRank.NINE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.TEN));
		hp.AddCard(new Card(eSuit.SPADES,eRank.JACK));
		hp.ScoreHand();
		System.out.println("");
		assertEquals(hp.isStraightFlush(),true);
	}
	
	@Test
	public void FlushTest1() {
		System.out.println("Flush");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.ACE));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.NINE));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.EIGHT));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.KING));
		hp.ScoreHand();
		System.out.println("");
		assertEquals(hp.isFlush(),true);
	}
	
	@Test
	public void StraightTest1() {
		System.out.println("Straight");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.HEARTS,eRank.EIGHT));
		hp.AddCard(new Card(eSuit.SPADES,eRank.NINE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.TEN));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.JACK));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.QUEEN));
		hp.ScoreHand();
		System.out.println("");
		assertEquals(hp.isStraight(),true);
	}
	
	@Test
	public void StraightTest2() {
		System.out.println("Straight");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.ACE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.THREE));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.FOUR));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.ScoreHand();
		System.out.println("");
		assertEquals(hp.isStraight(),true);
	}
	
	@Test
	public void TwoPairTest1() {
		System.out.println("Two Pair");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.ScoreHand();
		System.out.println("");
		assertEquals(hp.isTwoPair(),true);
	}
	
	@Test
	public void TwoPairTest2() {
		System.out.println("Two Pair");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.THREE));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.EIGHT));
		hp.AddCard(new Card(eSuit.SPADES,eRank.EIGHT));
		hp.ScoreHand();
		System.out.println("");
		assertEquals(hp.isTwoPair(),true);
	}
	
	@Test
	public void PairTest1() {
		System.out.println("Pair");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TEN));
		hp.AddCard(new Card(eSuit.SPADES,eRank.TEN));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.KING));
		hp.AddCard(new Card(eSuit.SPADES,eRank.NINE));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.FIVE));
		hp.ScoreHand();
		System.out.println("");
		assertEquals(hp.isPair(),true);
	}
	
	@Test
	public void PairTest2() {
		System.out.println("Pair");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.HEARTS,eRank.SIX));
		hp.AddCard(new Card(eSuit.SPADES,eRank.SIX));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TEN));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.ScoreHand();
		System.out.println("");
		assertEquals(hp.isPair(),true);
	}
	
	@Test
	public void HighCardTest1() {
		System.out.println("High Card");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.EIGHT));
		hp.AddCard(new Card(eSuit.SPADES,eRank.THREE));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.ACE));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.TEN));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.NINE));
		hp.ScoreHand();
		System.out.println("");
		assertEquals(hp.isHighCard(),true);
	}
}
