import { Wrapper } from 'components/Common';
import styled from 'styled-components'
import Retro from 'assets/music/NewJeans-Retro.mp3';

const Test = () => {
  // const audioElement = new Audio("https://ipaudio3.club/wp-content/uploads/HARFREE/Dale%2001%20-%20Sorcerer's%20Stone/Chapter%2001%20-%20The%20Boy%20Who%20Lived.mp3?_=1")
  const audioElement = new Audio(Retro)
  // const audioElement = new Audio("https://www.youtube.com/watch?v=jT0Lh-N3TSg")
  
  const playAudio = () => {
    audioElement.play();
  }

  return (
    <Wrapper>
      <button style={{ color: 'red'}} onClick={() => playAudio()}>
        {Retro}
      </button>
    </Wrapper>
  )
}

// const Audio = styled.audio`
//   display: block;
//   background-color: yellow;
//   border-radius: 3px;
// `

export default Test;