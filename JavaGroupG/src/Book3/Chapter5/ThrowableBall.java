package Book3.Chapter5;

public interface ThrowableBall {
    void throwBall();
    void catchBall();
}
interface KickableBall{
    void kickBall();
    void catchBall();
}
 interface Playable2 extends ThrowableBall, KickableBall
 {
     void dropBall();
 }
