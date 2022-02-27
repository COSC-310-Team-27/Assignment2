<script>
const popup = document.querySelector('.chat-popup');
const chatBtn = document.querySelector('.chat-btn');
const submitBtn = document.querySelector('.submit');

const chatArea = document.querySelector('.chat-area');
const inputElm = document.querySelector('input');
const emojiBtn = document.querySelector('#emoji-btn');
const picker = new EmojiButton();

// Emoji selection
window.addEventListener('DOMContentLoaded', () => {
    //create chatbot/person when page is loaded
<%= ChatBot chatBot = new ChatBot();  // creating a chatBot for current user 
    Person person = new Person(); // creating a person for current client. (used in snd msg/receive msg)
%> 
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
<%=  // example of logic working with UI using JSP. 
    // GOAL: insert recursive function for receiving question, and storing value.

    switch(/* CURRENT QUESTION */) { // scratch example for receiving question/returning answer (not final). 
      case q1 : 
        person.name = (String) %>inputElm.value;<%= // if asked for name, value for name is stored in person.name;
        break;
      case q2:
        person.age = (String) %>inputElm.value;<%=
        break;
      case q3:
          person.occupation = (String) %>inputElm.value;<%=
        break;  
      case q4:
          person.hobbies = (String) %>inputElm.value;<%=
          break;
        // return selection choices for next options? 
        // idea: Narrow down towards a category of questions for user to receive, return question based on keywords 
      default: 
        out.print("An error has occurred, please refresh your page and try again. Thank you!");
    }
%>
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

 
// respons msg 
submitBtn.addEventListener('click', ()=>{  
<%= 
         // call recursive method for pattern matching and selecting appropriate question in JAVA
%>
      let temp = `<div class="out-msg">
        <span class="msg">${<%= /*Insert sorted question here.*/%>}</span>
        <img src="images/msg1.jpg" class="avatar">
        </div>`;
 
        }
    }
  }
    chatArea.insertAdjacentHTML("beforeend", temp); // i think "beforeend" is supposed to be a different tag for the chatBot response (not sure)
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

</script>
