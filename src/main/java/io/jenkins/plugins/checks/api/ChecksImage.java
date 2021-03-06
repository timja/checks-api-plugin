package io.jenkins.plugins.checks.api;

import java.util.Optional;

import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * An image of a check. Users may use a image to show the code coverage, issues trend, etc.
 */
@SuppressWarnings("PMD.DataClass")
public class ChecksImage {
    private final String alt;
    private final String imageURL;
    private final String caption;

    /**
     * Constructs an image with all parameters.
     *
     * @param alt
     *         the alternative text for the image
     * @param imageURL
     *         the full URL of the image
     * @param caption
     *         a short description of the image
     */
    @SuppressFBWarnings("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
    public ChecksImage(@CheckForNull final String alt, @CheckForNull final String imageURL,
                       @CheckForNull final String caption) {
        this.alt = alt;
        this.imageURL = imageURL;
        this.caption = caption;
    }

    /**
     * Returns the alternative text for the image.
     *
     * @return the alternative text for the image
     */
    public Optional<String> getAlt() {
        return Optional.ofNullable(alt);
    }

    /**
     * Returns the image URL.
     * Note: This method will be deprecated after 1.0.0, use {@link ChecksImage#getImageURL()} instead.
     *
     * @return the image URL
     */
    public Optional<String> getImageUrl() {
        return getImageURL();
    }

    /**
     * Returns the image URL.
     *
     * @return the image URL
     */
    public Optional<String> getImageURL() {
        return Optional.ofNullable(imageURL);
    }

    /**
     * Returns the short description of the image.
     *
     * @return the short description of the image
     */
    public Optional<String> getCaption() {
        return Optional.ofNullable(caption);
    }

    @Override
    public String toString() {
        return "ChecksImage{"
                + "alt='" + alt + '\''
                + ", imageUrl='" + imageURL + '\''
                + ", caption='" + caption + '\''
                + '}';
    }
}
