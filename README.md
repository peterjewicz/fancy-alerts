# Fancy Alert

Fancy Alert is a customizable drop in replacement for the standard Javascript/Clojurescript alert box.

## Overview

IN PROGRESS

## Accepted Properties
All properties are passed as a map to the startup function
<br />

:text - Text for the alert to display <br />
:timeout - Time before the alert closes itself, can be turn off when hideAfterN is false  <br />
:hideAfterN - Bool, sets whether the alert should close on it's own  <br />
:showButton - Bool, sets whether a close button should be displayed, defaults to true if hideAfterN is false <br />
:buttonProperties - map of properties for the button <br />
:buttonText - Button properties key - text to display for close button if present <br />
:styles - Custom styles for the alert box - see below for example

## Styling

Styles are taken as a map on the initial call as part of a ````:syles```` key


````
{:styles {
  :background "red;"
  :color "white;"
}}
````

This is then merged in with the base styles object. Anything passed in will overwrite the defaults, and anything not
present by default will be accepted.
