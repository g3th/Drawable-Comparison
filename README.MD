# Drawable Comparison
## Comparing Drawables in Android By Tags

For some app development or in particular projects, a comparison between drawables inside an ImageView or similar View might be needed. Such a case might be a drag-and-drop operation which needs to match two images for a game. Another case, might look if an ImageView contains a blank/placeholder image, and replace it with an image of choice in specific cases.

The easiest method I have found personally is tag usage. Swapping tags, and comparing them will be much easier than using something like:

``` binding.image.drawable.constantState```

or

```binding.image.drawable.toBitmap()```

and similar methods. I have not had much success with the above, and found the most effective method was the one mentioned.
