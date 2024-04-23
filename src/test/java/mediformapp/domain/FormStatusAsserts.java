package mediformapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class FormStatusAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertFormStatusAllPropertiesEquals(FormStatus expected, FormStatus actual) {
        assertFormStatusAutoGeneratedPropertiesEquals(expected, actual);
        assertFormStatusAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertFormStatusAllUpdatablePropertiesEquals(FormStatus expected, FormStatus actual) {
        assertFormStatusUpdatableFieldsEquals(expected, actual);
        assertFormStatusUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertFormStatusAutoGeneratedPropertiesEquals(FormStatus expected, FormStatus actual) {
        assertThat(expected)
            .as("Verify FormStatus auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertFormStatusUpdatableFieldsEquals(FormStatus expected, FormStatus actual) {
        assertThat(expected)
            .as("Verify FormStatus relevant properties")
            .satisfies(e -> assertThat(e.getFormStatusID()).as("check formStatusID").isEqualTo(actual.getFormStatusID()))
            .satisfies(e -> assertThat(e.getStatus()).as("check status").isEqualTo(actual.getStatus()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertFormStatusUpdatableRelationshipsEquals(FormStatus expected, FormStatus actual) {
        assertThat(expected)
            .as("Verify FormStatus relationships")
            .satisfies(e -> assertThat(e.getTemplateForm()).as("check templateForm").isEqualTo(actual.getTemplateForm()))
            .satisfies(e -> assertThat(e.getChild()).as("check child").isEqualTo(actual.getChild()));
    }
}