/*Reset the browser's default ugly spacing */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}



/*Target the whole body */
body {
    background-color: #1a1a1a; /*Dark Gray (Hacker style) color*/
color: white;       /* White Text */
font-family: sans-serif;        /* Modern Font */
}




/* Styling the Hero Card */
.card {
text-align: center;
padding: 30px;
background-color: #2d2d2d;  /* Slightly lighter Gray */
margin: 20px auto;  /* "auto" centers the box horizonally */
border-radius: 15px;    /* Rounded Corners */
border: 1px solid #444; /*Thin border */
max-width: 600px;   /*Prevents boxex from getting too wide on big screens */
}





/*Fix the lists */
ul, ol {
    list-style-position: inside;    /* Brings bullets inside the center alignment */
    line-height: 1.6;   /* Adds breathing room between lines */
}





/* The "Haire me" Button */
.action-btn {
    display: block; /*allow us to move it like a box */
    margin: 20px auto;  /*Centering magic (Top/Bottom 20px,Left/Right Auto) */
    padding: 15px 40px; /*make it big */
    background-color: #00ff00;  /*hacker Green*/
    color: black;   /* Black text for contrast */
    font-size: 18px;    /* Readable text */
    font-weight: bold;  /* Thick letters */
    border: none;   /* remove ugly border */
    border-radius: 50px;    /* Fully rounded pill shape*/
cursor: pointer;    /*Change mouse to a hand icon */
}







/*Make it glow when you hover over it */
.action-btn:hover {
    background-color: #00cc00;  /*Slightly darker green*/
    transform: scale(1.5);  /* Glow slightly */
}





/*Styling the Profile Picture */
.profile-img {
width: 150px;   /* Fixed size */
height: 150px;  /* Equal size makes it a square */
border-radius: 50%; /* This turn the square into a perfect circle */
border: 3px solid #00ff00;  /* Green Hacker Border */
margin-bottom:15px;     /* push the name down a bit */
object-fit: cover;  /* Ensure the face isn't suished */
object-position: 45% 17%;   /*Focus on the top */
}






/*The Dashboard Layout */
.dashboard-grid {
    display: flex;  /*The Magic Switch: Turns Vertical to Horizontal */
    gap: 20px;  /*Addsspace between the two cards */
    max-width: 800px;   /*keep it neat */
    margin: 0 auto; /*Center the whole grid on the screen */
}







/*Make the inner cards flexible */
.dashboard-grid .card {
    flex: 1;    /* "Both of you take up equal space" */
    margin: 0;  /* Remove old margin we swt earlier */
}





/* --- MOBILE RESPONSIVENESS --- */
/*This rule only activates if the screen is smaller than 768px */
@media (max-width: 768px) {
    /* Force the Grid to stack vertically */
    .dashboard-grid {
        flex-direction: column;     /*Stack Top-to-Bottom instead of Side-by-Side */
    }
    /* Remove the profile picture border on mobile (looks cleaner) */
    .profile-img {
        width: 100px;
        height: 100px;
        border: 2px solid #00ff00;
    }
    /* Make the text slightly smaller for photos */
    h1 {
        font-size:24px;
    }
}
