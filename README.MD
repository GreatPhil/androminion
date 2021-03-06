## Androminon: Unofficial Dominion for Android

- Note 1 : This is neither supported nor endorsed by Rio Grande Games.
- Note 2 : This version of androminion was modified substantially for a class project.
- Note 3 : Majority of newly added code is located in: androminion/src/com/vdom/players/.
- [Androminon Official Releases Are Located Here](https://github.com/mehtank/androminion/releases)

### Unofficial Releases:

Version 1.0.0  ---  Original release for CS510 project.

### How to Compile:

Within the 'src/' directory, type: __javac com/vdom/core/Game.java__

### Summary:

This project was forked in October 2017 from the official Androminion "VDom" project (https://github.com/mehtank), which is a well-maintained software implementation of the widely popular Dominion card game, including a few AI player implementations built on top of a baseline heuristic (BasePlayer) computer player.

As part of a group project for an Artificial Intelligence class (CS510) that I was enrolled in at Drexel University, I worked with a project group to extend the VDom baseline player to include both a forward search for its __Action phase__ and pre-planner which would select the cards to acquire as part of its __Buy Phase__.  Our final report for the project is included here as well.

This repo will be used for updating the project further beyond the scope reached in class, and potentially including reinforcement learning (RL) to improve / tune our Dominion AI player's utility function weights.
