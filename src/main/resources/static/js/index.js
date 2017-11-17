$( document ).ready(function() {

    $('.slide').slideUp();

    $('.tlt1Fade').textillate({
      // sets the initial delay before starting the animation
      // (note that depending on the in effect you may need to manually apply
      // visibility: hidden to the element before running this plugin)
      initialDelay: 500,

      // set whether or not to automatically start animating
      autoStart: true,

      // in animation settings
      in: {
      	// set the effect name
        effect: 'fadeInLeft',

        // set the delay factor applied to each consecutive character
        delayScale: 1.5,

        // set the delay between each character
        delay: 55,

        // set to true to animate all the characters at the same time
        sync: false,

        // randomize the character sequence
        // (note that shuffle doesn't make sense with sync = true)
        shuffle: false,

        // reverse the character sequence
        // (note that reverse doesn't make sense with sync = true)
        reverse: false,

        sequence: true

        }
    });

    $('.tlt1Fade').on('inAnimationEnd.tlt', function () {
       $('#jumbText').collapse('show');
    });

});
