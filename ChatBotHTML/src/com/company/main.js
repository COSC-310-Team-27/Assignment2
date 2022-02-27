const popup = document.querySelector('.chat-popup');
const chatBtn = document.querySelector('.chat-btn');
const submitBtn = document.querySelector('.submit');

const chatArea = document.querySelector('.chat-area');
const inputElm = document.querySelector('input');
const emojiBtn = document.querySelector('#emoji-btn');
const picker = new EmojiButton();


// Emoji selection
window.addEventListener('DOMContentLoaded', () => {

    picker.on('emoji', emoji => {
      document.querySelector('input').value += emoji;
    });

    emojiBtn.addEventListener('click', () => {
      picker.togglePicker(emojiBtn);
    });
  });

//   chat button toggler

chatBtn.addEventListener('click', ()=>{
    popup.classList.toggle('show');
});

// send msg
submitBtn.addEventListener('click', ()=>{
    let userInput = inputElm.value;

    let temp = `<div class="out-msg">
    <span class="my-msg">${userInput}</span>
    <img src="images/msg1.jpg" class="avatar">
    </div>`;

    chatArea.insertAdjacentHTML("beforeend", temp);
    inputElm.value = '';
});
const submitEnt = document.querySelector('.submit');
submitEnt.addEventListener("keydown", (e) =>{
  let userInput = inputElm.value;
  event.preventDefault();
  if(e.keyCode === 13 ||e.isComposing){

    let temp = `<div class="out-msg">
    <span class="my-msg">${userInput}</span>
    <img src="images/msg1.jpg" class="avatar">
    </div>`;
    e.chatArea.insertAdjacentHTML("beforeend", temp);
    inputElm.value = '';
    }
});

const spans = document.querySelectorAll('header span');

spans.forEach((span, idx) => {
  span.addEventListener('click', (e) => {
    e.target.classList.add('active');
  });
  span.addEventListener('animationend', (e) => {
    e.target.classList.remove('active');
  });

  // Initial animation
  setTimeout(() => {
    span.classList.add('active');
  }, 750 * (idx+1));
});
